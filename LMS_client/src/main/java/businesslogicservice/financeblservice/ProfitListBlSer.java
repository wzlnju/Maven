package businesslogicservice.financeblservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import vo.financeVO.*;

public interface ProfitListBlSer {
	
	/**
	 * 系统根据当前时间生成一个截止点
	 * 并返回截止点之前的成本收益记录合集
	 * @author YangGuan
	 * @throws RemoteException 
	 *
	 */
	public ArrayList<ProfitVO> getProList() throws RemoteException;
}
