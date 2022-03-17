package com.madhu.project;



public class ModelValidation {
	
	
	public static void validateUserDetails(Model user)throws Exception {
		
			
			//To validate the user details
			
			
				if (user.getName()==null) {
					throw new Exception ("Invalid UserName");
				}
					else if (user.getPassword()==null) {
						throw new Exception ("Invalid Password");	
				}
					
					else if (user.getEmail()==null) {
						throw new Exception ("Invalid Email");
				}
					
				
				

				System.out.println("validation is passed");
				
				
				
				
				
				
			}
		}
	
		
