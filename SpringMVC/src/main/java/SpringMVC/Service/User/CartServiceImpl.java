package SpringMVC.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.CartDao;
import SpringMVC.Dto.CartDto;


@Service
public class CartServiceImpl implements ICartService{
	@Autowired
	private CartDao cartDao;

	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart) {
		return cartDao.AddCart(id, cart);
	}

	
	public HashMap<Integer, CartDto> EditCart(int id, int quanty, HashMap<Integer, CartDto> cart) {
		return cartDao.EditCart(id, quanty, cart);
	}

	
	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		return cartDao.DeleteCart(id, cart);
	}

	
	public int TotalQuanty(HashMap<Integer, CartDto> cart) {
		return cartDao.TotalQuanty(cart);
	}

	
	public double TotalPrice(HashMap<Integer, CartDto> cart) {
		return cartDao.TotalPrice(cart);
	}

}
