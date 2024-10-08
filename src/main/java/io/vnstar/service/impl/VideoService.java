package io.vnstar.service.impl;

import java.util.List;

import io.vnstar.config.JPAConfig;
import io.vnstar.dao.IVideoDao;
import io.vnstar.dao.impl.VideoDao;
import io.vnstar.entity.Video;
import io.vnstar.service.IVideoService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class VideoService implements IVideoService {

	IVideoDao videoDao = new VideoDao();
	@Override
	public int count() {
		return videoDao.count();
	}

	@Override
	public List<Video> findAll(int page, int pagesize) {
		return videoDao.findAll(page, pagesize);
	}

	@Override
	public List<Video> findByVideoname(String videoname) {
		return videoDao.findByVideoname(videoname);
	}

	@Override
	public List<Video> findAll() {
		return videoDao.findAll();
	}

	@Override
	public Video findById(int videoid) {
		return videoDao.findById(videoid);
	}

	@Override
	public void delete(int videoid) throws Exception {
		videoDao.delete(videoid);
	}

	@Override
	public void update(Video video) {
		videoDao.update(video);
	}

	@Override
	public void insert(Video video) {
		videoDao.insert(video);
	}

	@Override
	public List<Video> findByIdCategory(int cateid) {
		return videoDao.findByIdCategory(cateid);
	}

}
