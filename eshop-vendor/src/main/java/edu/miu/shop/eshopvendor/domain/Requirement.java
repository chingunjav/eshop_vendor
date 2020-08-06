package edu.miu.shop.eshopvendor.domain;

import java.time.LocalDate;

public class Requirement {

	String requestId;
	String subject;
	LocalDate startDate;
	LocalDate dueDate;
	LocalDate endDate;
	ReqStatus status;
	String desc;
	int AssignTo;
	LocalDate registeredDate;
}
