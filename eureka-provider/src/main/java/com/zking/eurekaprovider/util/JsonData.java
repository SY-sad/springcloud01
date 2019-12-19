package com.zking.eurekaprovider.util;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 鏈嶅姟鍣ㄨ繑鍥炵粰瀹㈡埛绔殑JSON鏍煎紡鐨勬暟鎹�
 *
 */
public class JsonData extends HashMap<String, Object> implements Serializable {

	private static final long serialVersionUID = -8855960778711040221L;

	private static final String CODE_KEY = "code";// 鎿嶄綔浠ｇ爜 0 鎴愬姛 闈�0 澶辫触
	private static final String MESSAGE_KEY = "message";// 鎿嶄綔娑堟伅
	private static final String RESULT_KEY = "result";// 缁撴灉闆�
	private static final String PAGE_KEY = "page";// 椤电爜
	private static final String ROWS_KEY = "rows";// 姣忛〉琛屾暟/椤靛ぇ灏�
	private static final String TOTAL_KEY = "total";// 鎬昏褰曟暟

	public JsonData() {
		super();
		this.put(CODE_KEY, 0);// 榛樿鎿嶄綔鎴愬姛
	}

	public void setCode(Integer code) {
		this.put(CODE_KEY, code);
	}

	public void setMessage(String message) {
		this.put(MESSAGE_KEY, message);
	}

	public void setResult(Object result) {
		this.put(RESULT_KEY, result);
	}

	public void setPage(Integer page) {
		this.put(PAGE_KEY, page);
	}

	public void setRows(Integer rows) {
		this.put(ROWS_KEY, rows);
	}

	public void setTotal(Integer total) {
		this.put(TOTAL_KEY, total);
	}

}
