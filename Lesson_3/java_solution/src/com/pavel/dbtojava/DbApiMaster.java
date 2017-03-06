package com.pavel.dbtojava;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


class DbApiMaster {

	static {
		System.loadLibrary("Jdatabase"); //libJdatabase.so
	}
	public native int getTotalRowsNumber();	
	public native int getTotalRowsNumberLike(String wildCard);
	public native ArrayList<ShortModel> getAllSmallModels(ShortModel smodel);
	

	public static void main(String[] args) {
		DbApiMaster apiMaster = new DbApiMaster();		
		int totalRows = apiMaster.getTotalRowsNumber();
		System.out.println("Total rows in the table: " + totalRows);

		String filter = "A";		
		totalRows = apiMaster.getTotalRowsNumberLike(filter);
		System.out.println("Total rows in the table with name like " + filter + " : " + totalRows);


		int modelId = 100500;
		ShortModel shortModel = new ShortModel(modelId);		
		System.out.println(shortModel.toString());

		/**List<ShortModel> smodels = apiMaster.getAllSmallModels(new ShortModel());
		for (ShortModel smodel : smodels ) {
			System.out.println(smodel);
		}**/

		Model testModel = new Model.Builder(modelId).setGenres().build();
		System.out.println("Full model testing \n" + "Name: " + testModel.getName() + "\n" + "Genres: " + Arrays.toString(testModel.getGenres()));
		
	}
	
}