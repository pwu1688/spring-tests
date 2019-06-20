package com.example.it;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {
	
	private String message;
	
	public String getMessage() {
		return message;
	}

}
