package in.project.service;

import java.util.List;

import org.springframework.data.domain.Page;

import in.project.entity.CitizenPlan;
import in.project.request.SearchRequest;

public interface ReportService {
	public Page<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
}
