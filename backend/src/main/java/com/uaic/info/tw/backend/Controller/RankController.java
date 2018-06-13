package com.uaic.info.tw.backend.Controller;

import java.sql.SQLException;

import com.uaic.info.tw.backend.Controller.Database.CRUDController;

public class RankController {
	
	CRUDController crudController;
	
	public RankController() {
		crudController = new CRUDController();
	}
	
	public String getRanking() throws SQLException {
		String response = crudController.getOrderedRank();	
		return response;
	}
}
