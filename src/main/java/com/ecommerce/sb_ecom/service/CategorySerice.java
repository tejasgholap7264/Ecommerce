package com.ecommerce.sb_ecom.service;

import com.ecommerce.sb_ecom.payloads.CategoryDTO;
import com.ecommerce.sb_ecom.payloads.CategoryResponse;

public interface CategorySerice {
    CategoryDTO addCategory(CategoryDTO category);
    CategoryResponse getAllCategories(Integer pageNumber,Integer pageSize,String sortBy,String sortOrder);
    CategoryDTO updateCategory(CategoryDTO category, Long categoryId);
    CategoryDTO deleteCategory(Long categoryId);
}
