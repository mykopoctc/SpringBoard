package kr.ac.kopo.ctc.spring.board.web;

import java.util.HashMap;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.ctc.spring.board.domain.Sample;
import kr.ac.kopo.ctc.spring.board.repository.SampleRepository;

@RestController
public class SampleRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleRestController.class);

	@Autowired
	private SampleRepository sampleRepository;
	
	@RequestMapping("/api/sample/findOne/type1")
    public Sample findOneType1(@RequestParam HashMap<String, String> map) {
		Long id = Long.parseLong(map.get("id"));
		String title = map.get("title");
		logger.info("id: " + id);
		logger.info("title: " + title);
		return sampleRepository.findById(id).get();
    }
	
	@RequestMapping("/api/sample/findOne/type2")
    public ResponseEntity<Sample> findOneType2(@RequestParam HashMap<String, String> map) {
		String id = map.get("id");
		String title = map.get("title");
		logger.info("id: " + id);
		logger.info("title: " + title);
		
		if (id != null) {
			Long _id = Long.parseLong(id);
			Sample sample = sampleRepository.findById(_id).get();
			
	        if (sample == null) {
	        	logger.info("Sample with id " + id + " not found");
	            return new ResponseEntity<Sample>(HttpStatus.NOT_FOUND);
	        } else {
	        	return new ResponseEntity<Sample>(sample, HttpStatus.OK);
	        }
		} else {
			return new ResponseEntity<Sample>(HttpStatus.NOT_FOUND);
		}
    }
	
	@RequestMapping("/api/sample/findOne/type3")
    public ResponseEntity<Optional<Sample>> findOneType3(@RequestParam HashMap<String, String> map) {
		String id = map.get("id");
		String title = map.get("title");
		logger.info("id: " + id);
		logger.info("title: " + title);
		
		if (id != null) {
			Long _id = Long.parseLong(id);
			Optional<Sample> sample = sampleRepository.findById(_id);
			return new ResponseEntity<Optional<Sample>>(sample, HttpStatus.OK);
		} else {
			return new ResponseEntity<Optional<Sample>>(HttpStatus.NOT_FOUND);
		}
    }

}
