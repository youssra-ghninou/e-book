package com.bookStore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepositroy;

@Service
public class MyBookListService {
	@Autowired
	public MyBookRepositroy mybook;
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}

}
