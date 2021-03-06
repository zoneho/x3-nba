package com.ftkj.manager.custom.guess;

import com.ftkj.enums.battle.EBattleAttribute;
import com.ftkj.manager.battle.model.BattleSource;
import com.ftkj.manager.custom.CustomGuessResult;
import com.ftkj.manager.custom.CustomPVPRoom;

/**
 * @author tim.huang
 * 2017年8月30日
 * 双方得分总和
 */
public class CustomGuessDF2 implements ICustomGuessBattle{
	
	@Override
	public CustomGuessResult getCustomGuessResult(BattleSource bs) {
		CustomPVPRoom room = bs.getAttributeMap(0).getVal(EBattleAttribute.擂台赛房间);
		CustomGuessResult result = new CustomGuessResult(room.getRoomId());
		result.setHomeName(bs.getHome().getName());
		result.setAwayName(bs.getAway().getName());
		result.setA(bs.getHome().getScore()>bs.getAway().getScore());
		return result;
	}
	
	
}
