package arabicStar.dataServiceImpl.orderDataServiceImpl;

import java.util.Date;

import arabicStar.dataService.orderDataService.OrderDataService;
import arabicStar.po.OrderPO;

/**
 * 这是Order数据的实现
 * 
 * @author WaterWan
 *
 */
public class OrderDataServiceImpl_Stub implements OrderDataService {

	@Override
	public OrderPO getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return new OrderPO();
	}

	@Override
	public Date getTime() {
		// TODO Auto-generated method stub
		System.out.println("Get TIME");
		return new Date();
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		System.out.println("Get ROOM");
		return new String("Room");
	}

	@Override
	public String getAppeal() {
		// TODO Auto-generated method stub
		System.out.println("Get APPEAL");
		return new String("Appeal");
	}

	@Override
	public boolean insertOrder(OrderPO orderPO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderPO deleteOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPO findOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateOrder(OrderPO orderPO) {
		// TODO Auto-generated method stub
		return false;
	}

}
