package org.sagittarius90.api.utils;

import org.junit.Test;

public class IdUtilsTest {

	@Test
	public void testIdHashids() {
		String encodeId = IdUtils.encodeId(24223l);
		System.out.println(encodeId);
		assert encodeId != null;
	}
}
