package com.lcwd.electronic.store.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageNameValidator implements ConstraintValidator <ImageNameValid,String>{
// ha class imagevalidation sati kela aahe because of custom validation 
    private Logger logger= LoggerFactory.getLogger(ImageNameValidator.class);
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        logger.info("Message from isValid : {}", value);
      // logic
    if (value.isBlank())
    {
        return false;
    }
    else {
        return  true;
    }

    }
}
