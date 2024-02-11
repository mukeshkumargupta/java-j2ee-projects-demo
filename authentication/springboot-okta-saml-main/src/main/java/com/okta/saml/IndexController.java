package com.okta.saml;

import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.opensaml.saml2.core.Attribute;
import org.springframework.security.providers.ExpiringUsernameAuthenticationToken;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String index(ExpiringUsernameAuthenticationToken userToken, Model model) {
    	 System.out.println("Loading home page");
    	 System.out.println("*******************************************");
    	 
 		 SAMLCredential credential = (SAMLCredential) userToken.getCredentials();
         List<Attribute>  attributes = credential.getAttributes(); 
         System.out.println("userToken.getName()" + userToken.getName());
         
         for( Attribute data : attributes ) {
        	 System.out.println(data.getName() + " == " + credential.getAttributeAsString(data.getName()));
        	 
        	 if(!StringUtils.isBlank(data.getName())) {
        		 
        		 switch(data.getName().trim()) {
        		 
        		   case "email" :
        			   model.addAttribute(data.getName(), credential.getAttributeAsString(data.getName()));
        			   break;
        			   
        		   case "firstName" :
        			   model.addAttribute(data.getName(), credential.getAttributeAsString(data.getName()));
        			   break;
        		  
        		   case "lastName" :
        			   model.addAttribute(data.getName(), credential.getAttributeAsString(data.getName()));
        			   break;
        			 
        		   case "group" :
        			   model.addAttribute(data.getName(), credential.getAttributeAsString(data.getName()));
        			   break;
        		 
        			   default:
        				   break;
        		 }
        		 
        		 
        	 }
        	 
         }
         
 		
        return "index";
    }
    
  
}