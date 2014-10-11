package com.lnsoft.yanfa.service.dict.query;

import java.util.HashMap;
import java.util.Map;

import com.lnsoft.yanfa.service.DictQueryService;

public class RemoteQueryServiceImpl implements DictQueryService {
	private static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("1", "ÃÀ¹ú");
		map.put("2", "¶íÂÞË¹");
	}

	@Override
	public String search(String key) {
		return map.get(key);
	}

}
