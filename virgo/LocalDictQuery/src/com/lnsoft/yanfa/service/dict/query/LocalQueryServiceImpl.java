package com.lnsoft.yanfa.service.dict.query;

import java.util.HashMap;
import java.util.Map;




import org.springframework.stereotype.Service;

import com.lnsoft.yanfa.service.DictQueryService;

@Service("dictQueryService")
public class LocalQueryServiceImpl implements DictQueryService {
	private static Map<String, String> map = new HashMap<String, String>();

	static {
		map.put("1", "jinan");
		map.put("2", "taian");
	}

	@Override
	public String search(String key) {
		return map.get(key);
	}

}
