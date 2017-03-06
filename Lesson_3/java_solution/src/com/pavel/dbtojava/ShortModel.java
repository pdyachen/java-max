package com.pavel.dbtojava;


class ShortModel {
	private int id;
	private String name, pictureSmall;

	static {
		System.loadLibrary("Jdatabase"); //libJdatabase.so
	}

	public static native String getModelName(int id);
	public native String getModelSmallpicture(int id);

	public ShortModel(int id) {
		this.id	= id;
		this.name = getModelName(id);
		this.pictureSmall = getModelSmallpicture(id);
	}

	public ShortModel() {
		
	}

	private void setId(int id) {
		this.id = id;
	}

	public void setName(String name, int id) {
		if (id == this.id) {
			this.name = name;
		}		
	}

	public void setPictureSmall(String pictureSmall, int id) {
		if (id == this.id) {
			this.pictureSmall = pictureSmall;			
		}		
	}

	@Override
	public String toString() {
		String result = new StringBuilder("Name Of Artist: ").append(name)
										  .append("\n")
										  .append("Icon: ")
										  .append(pictureSmall)
										  .toString();
		return result;
	}

}