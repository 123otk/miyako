package com.internousdev.miyako.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.miyako.dto.DestinationInfoDTO;

public class DestinationInfoDTOTest {

	@Test
	public void testGetId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testGetId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 2147483647;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testGetId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483648;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testGetId4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testGetId5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testSetId() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = 2147483647;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		int expected = -2147483648;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected,actual);
	}

	public void testSetId4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int Max = Integer.parseInt("2147483647");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	public void testSetId5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		try{
			int Max = Integer.parseInt("-2147483648");
			dto.setId(Max);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}


	@Test
	public void testGetUserId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testGetUserId8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}


	@Test
	public void testSetUserId1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}

	public void testSetUserId8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserId(expected);

		dto.getUserId();
		String actual = dto.getUserId();
		assertEquals(expected,actual);
	}



	@Test
	public void testGetFamilyName1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testGetFamilyName8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyName1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}

	public void testSetFamilyName8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyName(expected);

		dto.getFamilyName();
		String actual = dto.getFamilyName();
		assertEquals(expected,actual);
	}


	@Test
	public void testGetFirstName1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testGetFirstName8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstName1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	public void testSetFirstName8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstName(expected);

		dto.getFirstName();
		String actual = dto.getFirstName();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFamilyNameKana1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFamilyNameKana8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamilyNameKana1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFamilyNameKana8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFamilyNameKana(expected);

		dto.getFamilyNameKana();
		String actual = dto.getFamilyNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetFirstNameKana1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testGetFirstNameKana8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirstNameKana1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	public void testSetFirstNameKana8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setFirstNameKana(expected);

		dto.getFirstNameKana();
		String actual = dto.getFirstNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetEmail1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testGetEmail8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}

	public void testSetEmail8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setEmail(expected);

		dto.getEmail();
		String actual = dto.getEmail();
		assertEquals(expected,actual);
	}



	@Test
	public void testGetPhoneNumber1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testGetPhoneNumber8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetPhoneNumber1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	public void testSetPhoneNumber8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setPhoneNumber(expected);

		dto.getPhoneNumber();
		String actual = dto.getPhoneNumber();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetUserAddress1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testGetUserAddress8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetUserAddress1() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected =null;
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress2() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress3() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = " ";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress4() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "　";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress5() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress6() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "あいう１２３";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress7() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "abc123あいう１２３";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

	public void testSetUserAddress8() {
		DestinationInfoDTO dto = new DestinationInfoDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		dto.setUserAddress(expected);

		dto.getUserAddress();
		String actual = dto.getUserAddress();
		assertEquals(expected,actual);
	}

}