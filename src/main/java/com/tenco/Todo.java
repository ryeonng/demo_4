package com.tenco;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Todo {
	
	private int id;
	private String title;
	private boolean completed;
	
	// toString 직접 오버라이드 해서 json으로 변환
	@Override
	public String toString() {
		return "{ \"id\" : "+ id +"}";
	}
}
