 
function makeAjaxCall(){
    var dataToSend = JSON.stringify(serializeObject($('employeeForm')));

	$.ajax({
        type: "POST",
        url: "/addEmployee",
        dataType: "json",
        data: dataToSend,
        contentType: 'application/json',
		success: function(result) {
            console.log('success');
            console.log(result);
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " + result.firstName + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " + result.lastName + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " + result.email + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			make_hidden('errors');
		},

		error: function(errorObject){
            console.log('error');
            if (errorObject.responseJSON.errorType === 'ValidationError') {
                $('#errors').html("");
                $("#errors").append( '<H3 align="center"> Error(s)!!! <H3>');
                let errorArray = errorObject.responseJSON.errors;
                $.each(errorArray, function (index, e) {
                    $('#errors').append("<H4>" + e.message + "</h4>"  );
                })
                $("#errors").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'errors\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
            } else {
                alert(errorObject.responseJSON.errors(0));
            }
            make_visible('errors');
            make_hidden('formInput');
		}
	
	});
}

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	

make_hidden = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
        }	   

make_visible = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
 }	   

resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

