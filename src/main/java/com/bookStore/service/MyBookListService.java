package com.bookStore.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepositroy;

@Service
public class MyBookListService {
	@Autowired
	public MyBookRepositroy mybook;
	public MyBookList saveMyBooks(MyBookList book) {
		return mybook.save(book); // Return the saved MyBookList object
	}

	public List<MyBookList> getAllMyBooks(){
	return mybook.findAll();
}
public void deleteById(int id) {
	mybook.deleteById(id);
}
}

