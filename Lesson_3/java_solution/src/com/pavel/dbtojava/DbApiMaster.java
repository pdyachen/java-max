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
	public static native String[] getGenresJni(int model_Id);
	public static native String getModelName(int id);
	public static native String getModelBigPicture(int id);
	public static native String getModelSmallPicture(int id);
	

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



		Model testModel = new Model.Builder(modelId)
										   .setGenres()
										   .setCovers()
										   .build();

		String resultString = new StringBuilder("Full model testing \nName: ")
											   .append(testModel.getName())
											   .append("\n")
											   .append("Genres: ")
											   .append(Arrays.toString(testModel.getGenres()))
											   .append("\n")
											   .append("Covers: ")
											   .append(testModel.getCovers())
											   .toString();						   
		System.out.println(resultString);
		
	}
	
}