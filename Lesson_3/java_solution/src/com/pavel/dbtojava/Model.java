package com.pavel.dbtojava;
import java.util.Map;

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
			this.name = ShortModel.getModelName(id);
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
			this.genres = getGenresJni(this.id);
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

		Builder setCovers(Map<String,String> covers) {
			this.covers = covers;
			return this;
		}

		public Model build() {
			return new Model(this);
		}

		public static native String[] getGenresJni(int model_Id);

		
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
