package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miyako.dto.UserInfoDTO;

public class UserInfoDTOTest {

	@Test
	public void testGetId1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	public void testGetId2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	public void testGetId3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	public void testGetId4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testGetId5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testSetId1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	public void testSetId2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	public void testSetId3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	public void testSetId4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testSetId5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testGetUserId1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetUserId1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetPassword() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testGetPassword8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	public void testSetPassword8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setPassword(expected);

		String actual = dto.getPassword();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyName1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyName1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstName1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstName1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyNameKana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyNameKana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstNameKana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstNameKana1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSex1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setSex(expected);

		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	public void testGetSex2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;
		dto.setSex(expected);

		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	public void testGetSex3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;
		dto.setSex(expected);

		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	public void testGetSex4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setSex(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testGetSex5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setSex(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testSetSex1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setSex(expected);

		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	public void testSetSex2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;
		dto.setSex(expected);

		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	public void testSetSex3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;
		dto.setSex(expected);

		int actual = dto.getSex();
		assertEquals(expected,actual);
	}

	public void testSetSex4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setSex(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testSetSex5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setSex(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testGetEmail1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setEmail(expected);

		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetStatus1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testGetStatus8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetStatus1() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected =null;
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus2() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus3() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = " ";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus4() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "　";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus5() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus6() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "あいう１２３";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus7() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	public void testSetStatus8() {
		UserInfoDTO dto = new UserInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setStatus(expected);

		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetLogined1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setLogined(expected);

		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}

	public void testGetLogined2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;
		dto.setLogined(expected);

		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}

	public void testGetLogined3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;
		dto.setLogined(expected);

		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}

	public void testGetLogined4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setLogined(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testGetLogined5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setLogined(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	@Test
	public void testSetLogined1() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 0;
		dto.setLogined(expected);

		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}

	public void testSetLogined2() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = 2147483647;
		dto.setLogined(expected);

		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}

	public void testSetLogined3() {
		UserInfoDTO dto = new UserInfoDTO();
		int expected = -2147483648;
		dto.setLogined(expected);

		int actual = dto.getLogined();
		assertEquals(expected,actual);
	}

	public void testSetLogined4() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setLogined(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testSetLogined5() {
		UserInfoDTO dto = new UserInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setLogined(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}
	@Test
	public void testGetRegistDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetRegistDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetUpdateDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetUpdateDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetLoginAdmin1() {
		UserInfoDTO dto = new UserInfoDTO();
		boolean expected = true;
		dto.setLoginAdmin(expected);

		boolean actual = dto.getLoginAdmin();
		assertEquals(expected,actual);
	}

	public void testGetLoginAdmin2() {
		UserInfoDTO dto = new UserInfoDTO();
		boolean expected = false;
		dto.setLoginAdmin(expected);

		boolean actual = dto.getLoginAdmin();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetLoginAdmin1() {
		UserInfoDTO dto = new UserInfoDTO();
		boolean expected = true;
		dto.setLoginAdmin(expected);

		boolean actual = dto.getLoginAdmin();
		assertEquals(expected,actual);
	}

	public void testSetLoginAdmin2() {
		UserInfoDTO dto = new UserInfoDTO();
		boolean expected = false;
		dto.setLoginAdmin(expected);

		boolean actual = dto.getLoginAdmin();
		assertEquals(expected,actual);
	}
}
