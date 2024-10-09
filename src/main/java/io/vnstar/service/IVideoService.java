package io.vnstar.service;

import java.util.List;

import io.vnstar.entity.Video;

public interface IVideoService {
	int count();

	List<Video> findAll(int page, int pagesize);

	List<Video> findByVideoname(String videoname);

	List<Video> findAll();

	Video findById(String videoid);

	void delete(String videoid) throws Exception;

	void update(Video video);

	void insert(Video video);
	
	List<Video> findByIdCategory(int cateid);
}
