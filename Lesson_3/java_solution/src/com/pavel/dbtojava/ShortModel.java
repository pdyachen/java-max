package com.pavel.dbtojava;


class ShortModel {
	private int id;
	private String name, pictureSmall;
	
	public ShortModel(int id) {
		this.id	= id;
		this.name = DbApiMaster.getModelName(id);
		this.pictureSmall = DbApiMaster.getModelSmallPicture(id);
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