package edu.mum.validator;

import java.util.List;

public interface Validator {
    public List<String> validate(Object domainObject);
}
