package com.eswaraj.domain.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eswaraj.domain.nodes.Category;
import com.eswaraj.domain.validator.exception.ValidationException;

@Component
public class CategoryValidator extends BaseValidator<Category>{

	@Autowired
	public CategoryValidator(ValidationManager validationManager) {
		super(Category.class, validationManager);
	}

	@Override
	public void validateBeforeSave(Category category) throws ValidationException {
		checkIfEmpty("Name", category.getName(),"Category name can not be Null or Empty");
		checkIfNull("Department", category.getDepartment(),"Department Can not be null for category");
	}

	@Override
	public void validateBeforeDelete(Category category) throws ValidationException {
		// TODO Auto-generated method stub
		
	}

	

}
