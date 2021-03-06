package com.ftkj.client.robot.xgame;

import com.ftkj.client.ActionConsole;
import com.ftkj.client.robot.BaseRobot;
import com.ftkj.server.ServiceCode;
import com.ftkj.client.vo.HeroClient;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class XGameRobot extends BaseRobot {
	
	private static  AtomicInteger tmpNum = new AtomicInteger(0);
	
	private Map<Integer,HeroClient> heroMap;
	
	public XGameRobot(long teamId) {
		super(teamId);
		this.heroMap = new HashMap<Integer, HeroClient>();
	}
	
//	public void appendHeros(List<HeroPB.HeroData> heros){
//		heros.stream()
//				.forEach(hero->this.heroMap.put(hero.getId(), new HeroClient(hero.getId(),hero.getHeroId())));
//	}
	
	public int getNum(){
		return tmpNum.incrementAndGet();
	}
	@Override
	protected void init() {
		setAction(ActionConsole.getAction(ServiceCode.GameManager_loginPC));
	}
	
	public void run(){
		getAction().run(this);
	}
	
	

}
