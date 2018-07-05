package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miyako.dto.CartInfoDTO;

public class CartInfoDTOTest {

//start test for getId    int
	@Test
	public void testGetId01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId05() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
//finish test for getId


//start test for setId    int


	@Test
	public void testSetId01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId03() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();

		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testSetId04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();

		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for setId

	//start test for getUserId    String

	@Test
	public void testGetUserId01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetUserId02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//finish test for getUserId

	//start test for setUserId

	@Test
	public void testSetUserId01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}



	//finish test for setUserId

	//start test for getTempUserId

	@Test
	public void testGetTempUserId01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//finish test for getTempUserId

	//start test for setTempUserId

	@Test
	public void testSetTempUserId01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setTempUserId(expected);
		String actual = dto.getTempUserId();
		assertEquals(expected, actual);
	}

	//finish test for setTempUserId

	//start test for getProductId

	@Test
	public void testGetProductId01() {
			CartInfoDTO dto = new CartInfoDTO();
			int expected = 0;

			dto.setProductId(expected);
			int actual = dto.getProductId();
			assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected =  2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
}

	@Test
	public void testGetProductId03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected =  -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
}

	@Test
	public void testGetProductId04() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setProductId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId05() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setProductId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
}

	//finish test for getProductId

	//start test for setProductId     int


	@Test
	public void testSetProductId01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId04() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setProductId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId05() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setProductId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for setProductId

	//start test for getProductCount     int

	@Test
	public void testGetProductCount01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount04() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setProductCount(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductCount05() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setProductCount(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for getProductCount

	//start test for setProductCount

	@Test
	public void testSetProductCount01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setProductCount(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductCount05() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setProductCount(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for setProductCount

	//start test for getProductStock

	@Test
	public void testGetProductStock01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductStock(expected);
		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductStock02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductStock(expected);
		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductStock03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductStock(expected);
		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductStock04()  throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setProductStock(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductStock05() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setProductStock(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for getProductStock


	//start test for setProductStock

	@Test
	public void testSetProductStock01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductStock(expected);
		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductStock02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductStock(expected);
		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductStock03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductStock(expected);
		int actual = dto.getProductStock();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductStock04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setProductStock(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductStock05() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setProductStock(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for setProductStock

	//start test for getPrice

	@Test
	public void testGetPrice01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetPrice02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setPrice(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetPrice05() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setPrice(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for gerPrice


	//start test for setPrice
	@Test
	public void testSetPrice01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice04() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setPrice(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPrice05()  throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setPrice(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for setPrice

	//start test for getProductName

	@Test
	public void testGetProductName01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductName08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	//finish test for getProductName

	//start test for setProductName

	@Test
	public void testSetProductName01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductName08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}


	//finish test for setProductName

	//start test for getProductNameKana

	@Test
	public void testGetProductNameKana01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//finish test for getProductNameKana

	//start test for setProductNameKana


	@Test
	public void testSetProductNameKana01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//finish test for setProductNameKana

	//start test for getProductDescription


	@Test
	public void testGetProductDescription01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected =  "ａｂｃ１２３あいう漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}


	//finish test for getProductDescription

	//start test for setProductDescription

	@Test
	public void testSetProductDescription01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	//finish test for setProductDescription

	//start test for getCategoryId

	@Test
	public void testGetCategoryId01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetCategoryId04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setCategoryId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId05() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setCategoryId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for getCategoryId


	//start test for setCategoryId

	@Test
	public void testSetCategoryId01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCategoryId04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setCategoryId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategoryId05() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setCategoryId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}	}

	//finish test for setCategoryId

	//start test for getImageFilePath string
	@Test
	public void testGetImageFilePath01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFilePath02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFilePath08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//finish test for getImageFilePath

	//start test for setImageFilePath string

	@Test
	public void testSetImageFilePath01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetImageFilePath07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFilePath08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected, actual);
	}

	//finish test for setImageFilePath

	//start test for getImageFileName

	@Test
	public void testGetImageFileName01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	//finish test for getImageFileName


	//start test for setImageFileName


	@Test
	public void testSetImageFileName01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	//finish  test for setImageFileName

	//start test for getReleaseCompany
	@Test
	public void testGetReleaseCompany01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	//finish test for getReleaseCompany

	//start test for setReleaseCompany
	@Test
	public void testSetReleaseCompany01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	//finish test for setReleaseCompany

	//start test for getGetStatus
	@Test
	public void testGetStatus01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	//finish test for getStatus

	//start test for setStatus

	@Test
	public void testSetStatus01() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus02() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus03() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus04() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus05() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus06() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus07() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus08() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	//finish test for setStatus

	//start test for getSubtotal    int

	@Test
	public void testGetSubtotal01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setSubtotal(expected);
		int actual = dto.getSubtotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubtotal02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setSubtotal(expected);
		int actual = dto.getSubtotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubtotal03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setSubtotal(expected);
		int actual = dto.getSubtotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubtotal04() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setSubtotal(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetSubtotal05() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setSubtotal(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for getSubtotal

	//start test for setSubtotal

	@Test
	public void testSetSubtotal01() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setSubtotal(expected);
		int actual = dto.getSubtotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubtotal02() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setSubtotal(expected);
		int actual = dto.getSubtotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubtotal03() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setSubtotal(expected);
		int actual = dto.getSubtotal();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSubtotal04() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setSubtotal(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetSubtotal05() throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setSubtotal(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}



	//finish test for setSubtotal

}