package mum.edu.validator;

import java.util.List;

public interface Validator {
    public List<String> validate(Object domainObject);
}
