package io.vnstar.dao;

import java.util.List;

import io.vnstar.entity.Video;

public interface IVideoDao {
	int count();

	List<Video> findAll(int page, int pagesize);

	List<Video> findByVideoname(String videoname);

	List<Video> findAll();

	Video findById(int videoid);

	void delete(int videoid) throws Exception;

	void update(Video video);

	void insert(Video video);

	List<Video> findByIdCategory(int cateid);
}
