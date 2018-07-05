package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miyako.dto.MyPageDTO;

public class MyPageDTOTest {


	//start test for getId   int
	@Test
	public void testGetId01() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetId02() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId03() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId04() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId05() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for getId

	//start test for setId   int

	@Test
	public void testSetId01() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId02() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId03() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId04() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setId(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	//finish test for setId

	//start test for getUserId   string

	@Test
	public void testGetUserId01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}


	//finish test for getUserId

	//start test for setUserId   string

	@Test
	public void testSetUserId01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//finish test for setUserId

	//start test for getPasswor   string

	@Test
	public void testGetPassword01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetPassword02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPassword08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}
	//start test for getPasswor   string

	//start test for getPasswor   string
	@Test
	public void testSetPassword01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPassword08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setPassword(expected);
		String actual = dto.getPassword();
		assertEquals(expected, actual);
	}


	//finish test for getPasswor


	//start test for getFamilyName   string

	@Test
	public void testGetFamilyName01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	//finish test for getFamilyName   string

	//start test for setFamilyName   string
	@Test
	public void testSetFamilyName01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setFamilyName(expected);
		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}



	//finish test for setFamilyName   string


	//start  test for getFirstName   string
	@Test
	public void testGetFirstName01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName() {
		MyPageDTO dto = new MyPageDTO();
		String expected =  "ａｂｃ１２３あいう漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	//start  test for getFirstName   string

	//start  test for setFirstName   string

	@Test
	public void testSetFirstName01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetFirstName02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setFirstName(expected);
		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}


	//finish  test for setFirstName

	//start  test for getFamilyNameKana   string

	@Test
	public void testGetFamilyNameKana01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyNameKana08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	//start   test for getFamilyNameKana   string

	@Test
	public void testSetFamilyNameKana01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyNameKana08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setFamilyNameKana(expected);
		String actual = dto.getFamilyNameKana();
		assertEquals(expected, actual);
	}


	//finish  test for getFamilyNameKana

	//start  test for getFirstNameKana  string

	@Test
	public void testGetFirstNameKana01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setFirstNameKana(expected);
		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	//finish  test for getFirstNameKana

	//start  test for setFirstNameKana
	@Test
	public void testSetFirstNameKana01() {
			MyPageDTO dto = new MyPageDTO();
			String expected = null;

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana02() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana03() {
			MyPageDTO dto = new MyPageDTO();
			String expected = " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana04() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana05() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana06() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana07() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana08() {
			MyPageDTO dto = new MyPageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
	}


	//finish  test for setFirstNameKana

	//start  test for getSex
	@Test
	public void testGetSex01() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSex02() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSex03() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetSex04() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setSex(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetSex05() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setSex(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for getSex


	//start test for setSex
	@Test
	public void testSetSex01() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSex02() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSex03() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setSex(expected);
		int actual = dto.getSex();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetSex04() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setSex(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetSex05() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setSex(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//finish test for setSex


	//start test for getEmail  string


	@Test
	public void testGetEmail01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetEmail08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//finish test for getEmail

	//start test for getEmail

	@Test
	public void testSetEmail01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetEmail08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setEmail(expected);
		String actual = dto.getEmail();
		assertEquals(expected, actual);
	}

	//finish test for getEmail

	//start test for getStatus  string

	@Test
	public void testGetStatus01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetStatus08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	//finish test for getStatus  string

	//start test for setStatus  string


	@Test
	public void testSetStatus01() {
		MyPageDTO dto = new MyPageDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus02() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus03() {
		MyPageDTO dto = new MyPageDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus04() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus05() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus06() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus07() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "abc123あいう１２３";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetStatus08() {
		MyPageDTO dto = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected, actual);
	}

	//finish test for setStatus  string

	//start test for getLogined    int

	@Test
	public void testGetLogined01() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLogined02() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLogined03() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLogined04() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setLogined(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetLogined05() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("-214748364");
			dto.setLogined(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	//finish test for getLogined

	//start test for setLogined    int
	@Test
	public void testSetLogined01() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 0;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLogined02() {
		MyPageDTO dto = new MyPageDTO();
		int expected = 2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLogined03() {
		MyPageDTO dto = new MyPageDTO();
		int expected = -2147483647;

		dto.setLogined(expected);
		int actual = dto.getLogined();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLogined04() {
		MyPageDTO dto = new MyPageDTO();

		try {
			int Max = Integer.parseInt("214748364");
			dto.setLogined(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetLogined05() {
		MyPageDTO dto = new MyPageDTO();
		try {
			int Max = Integer.parseInt("214748364");
			dto.setLogined(Max);
		}catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	//finish test for setLogined

}
