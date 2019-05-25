package br.com.etechoracio.product.business;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.product.model.product;
import br.com.etechoracio.product.dao.productDAO;
public class productSB extends BaseSB {

	private productDAO productDAO;
	
private productDAO productDAO2;

@Override
protected void postConstructImpl()
{
	productDAO = getDAO(productDAO.class);
}

public List<product> findAll(){
	return productDAO.findAll();
}

@Transactional(propagation = Propagation.REQUIRED)
public void save(product product) {
	productDAO.save(product);
	
}

}