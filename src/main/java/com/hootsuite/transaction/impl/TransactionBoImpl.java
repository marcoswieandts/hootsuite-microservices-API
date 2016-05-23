package com.hootsuite.transaction.impl;

import com.hootsuite.transaction.TransactionBo;

public class TransactionBoImpl implements TransactionBo {

	public String save() {
		return "GraphDB - method save - Success";
	}

	public String saveas(String id) {

		return "GraphDB - method saveas - " + id +"Success";

	}
	
}