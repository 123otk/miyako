package com.internousdev.miyako.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miyako.dao.CategoryDAO;
import com.internousdev.miyako.dao.ProductInfoDAO;
import com.internousdev.miyako.dto.CategoryDTO;
import com.internousdev.miyako.dto.PaginationDTO;
import com.internousdev.miyako.dto.ProductInfoDTO;
import com.internousdev.miyako.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;
public class ProductInfoAction extends ActionSupport implements SessionAware{
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private int price;

	private String categoryId;
	private String keywords;
	private List<CategoryDTO> CategoryDtoList = new ArrayList<CategoryDTO>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();

	private Map<String, Object> session;
	public String execute(){


		String result = ERROR;


		ProductInfoDAO productInfoDao = new ProductInfoDAO();
		productInfoDtoList = productInfoDao.getProductInfoList(); //この時点ではproductInfoDtoListのなかはsql文で書いた商品総数が入っている
		Pagination pagination = new Pagination();
		PaginationDTO paginationDTO = pagination.initialize(productInfoDtoList, 6); //1ページあたりの商品数

		session.put("totalPageSize", paginationDTO.getTotalPageSize());

		session.put("currentPageNo", paginationDTO.getCurrentPageNo());
		session.put("totalRecordSize", paginationDTO.getTotalPageSize());
		session.put("startRecordNo", paginationDTO.getStartRecordNo());
		session.put("endRecordNo", paginationDTO.getEndRecordNo());
		session.put("pageNumberList", paginationDTO.getPageNumberList());
		session.put("productInfoDtoList", paginationDTO.getCurrentProductInfoPage());
		session.put("hasNextPage", paginationDTO.getHasNextPage());
		session.put("hasPreviousPage", paginationDTO.getHasPreviousPage());
		session.put("nextPageNo", paginationDTO.getNextPageNo());
		session.put("previousPageNo", paginationDTO.getPreviousPageNo());
		if(!session.containsKey("cateogoryList")) {
			CategoryDAO CategoryDao = new CategoryDAO();
			CategoryDtoList = CategoryDao.getCategoryList();
			session.put("CategoryDtoList", CategoryDtoList);
		}
		 result = SUCCESS;
		return result;
	}

	public List<CategoryDTO> getCategoryDtoList() {
		return CategoryDtoList;
	}

	public void setCategoryDtoList(List<CategoryDTO> CategoryDtoList) {
		this.CategoryDtoList = CategoryDtoList;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}
	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
