package com.pavel.dbtojava;
import java.util.Map;
import java.util.HashMap;

class Model {
	private int id;
	private String name;
	private int trackCount, albumCount;
	private String[] genres;
	private String webLink, description;
	private Map<String,String> covers;

	private Model(Builder builder) {
		id = builder.id;
		name = builder.name;
		trackCount = builder.trackCount;
		albumCount = builder.albumCount;
		genres = builder.genres;
		webLink = builder.webLink;
		covers = builder.covers;
	}

	public static class Builder {
		private final  int id;
		private final String name;
		private int trackCount, albumCount;
		private String[] genres;
		private String webLink, description;
		private Map<String,String> covers;

		public Builder(int id) {
			this.id = id;
			this.name = DbApiMaster.getModelName(id);
		}

		Builder setTrackCount(int trackCount) {
			this.trackCount = trackCount;
			return this;
		}

		Builder setAlbumCount(int albumCount) {
			this.albumCount = albumCount;
			return this;
		}

		Builder setGenres() {
			this.genres = DbApiMaster.getGenresJni(this.id);
			return this;
		}

		Builder setWebLink(String webLink) {
			this.webLink = webLink;
			return this;
		}

		Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		Builder setCovers() {
			this.covers = new HashMap<String, String>();
			this.covers.put("Big Picture", DbApiMaster.getModelBigPicture(this.id));
			this.covers.put("Small Picture", DbApiMaster.getModelSmallPicture(this.id));
			return this;
		}

		public Model build() {
			return new Model(this);
		}

		
	}

	public String getName() {
		return name;
	}

	public int getTrackCount() {
		return trackCount;
	}

	public int getAlbumCount() {
		return albumCount;
	}

	public String[] getGenres() {
		return genres;
	}

	public Map<String, String> getCovers () {
		return covers;
	}		

}
