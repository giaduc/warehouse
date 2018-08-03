package controller;

import view.CBottomPanel;
import view.CCenterPanel;
import view.BExportPanel;
import view.BSearchPanel;
import view.ContentBottomPanel;
import view.ContentCenterPanel;
import view.ContentPanel;
import view.ContentTopPanel;
import view.LeftPanel;
import view.UI;

public class WarehouseController {

	private UI ui;
	private LeftPanel leftPanel;
	private ContentPanel contentPanel;
	private ContentTopPanel contentTopPanel;
	
	private CCenterPanel cCenterPanel;
	
	private CBottomPanel cBottomPanel;
	private BSearchPanel bSearchPanel;
	private BExportPanel bExportPanel;
	
	private ContentCenterPanel contentCenterPanel;
	
	private ContentBottomPanel contentBottomPanel;

	public void loadLayout() {
		ui = new UI();

		// LeftPanel
		leftPanel = new LeftPanel();

		// ContentTopPanel
		contentTopPanel = new ContentTopPanel();
		
		// ContentCenterPanel
		bSearchPanel = new BSearchPanel();
		bExportPanel = new BExportPanel();
		
		cCenterPanel = new CCenterPanel();
		cBottomPanel = new CBottomPanel();
		cBottomPanel.loadCSearchPanel(bSearchPanel);
		cBottomPanel.loadCExportPanel(bExportPanel);
		
		contentCenterPanel = new ContentCenterPanel();
		contentCenterPanel.loadCCenterPanel(cCenterPanel);
		contentCenterPanel.loadCBottomPanel(cBottomPanel);
		
		// ContentBottomPanel
		contentBottomPanel = new ContentBottomPanel();

		contentPanel = new ContentPanel();
		contentPanel.loadContentTopPanel(contentTopPanel);
		contentPanel.loadContentCenterPanel(contentCenterPanel);
		contentPanel.loadContentBottomPanel(contentBottomPanel);
		
		// load left panel
		ui.loadLeftPanel(leftPanel);

		// load content panel
		ui.loadContentPanel(contentPanel);

	}

}
