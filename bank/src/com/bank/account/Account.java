package com.bank.account;

import java.sql.Date;
/*
java.util.Date - 년/월/일/시/분/초 - 처리하는 방법이 좀 까다롭긴 함.
java.sql.Date - 년/월/일
 */

import lombok.Data;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Account {
	private String accountId;
	private String memberId;
	private int balance;
	private Date credate;
}
