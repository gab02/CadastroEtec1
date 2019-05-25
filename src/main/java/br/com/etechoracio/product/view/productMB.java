package br.com.etechoracio.product.view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;
import br.com.etechoracio.product.business.*;
import br.com.etechoracio.product.model.product;

@Getter
@Setter
@Controller
@Scope("view")
public class productMB  extends BaseMB{



 

		private String message;

		@Autowired
		private productSB productSB;

		private product edit = new product();

		public void onSave() {
			productSB.save(edit);
			showInsertMessage();
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public void saveMessage() {
			FacesContext context = FacesContext.getCurrentInstance();

			context.addMessage(null, new FacesMessage("Successful", "Your message: " + message));
			context.addMessage(null, new FacesMessage("Second Message", "Additional Message Detail"));
		}
	}


