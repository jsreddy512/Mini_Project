package in.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import in.project.entity.CitizenPlan;
import in.project.repo.CitizenPlanRepository;
import in.project.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private CitizenPlanRepository planRepo;
	
	public Page<String> getPlanNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}
}