package controller;

import view.CBottomContainerPanel;
import view.CCenterPanel;
import view.BExportPanel;
import view.BSearchPanel;
import view.ContentBottomPanel;
import view.ContentCenterPanel;
import view.ContentContainerPanel;
import view.ContentTopPanel;
import view.LeftPanel;
import view.UIContainer;

public class WarehouseController {

	private UIContainer ui;
	private LeftPanel leftPanel;
	private ContentContainerPanel contentPanel;
	private ContentTopPanel contentTopPanel;
	
	private CCenterPanel cCenterPanel;
	
	private CBottomContainerPanel cBottomPanel;
	private BSearchPanel bSearchPanel;
	private BExportPanel bExportPanel;
	
	private ContentCenterPanel contentCenterPanel;
	
	private ContentBottomPanel contentBottomPanel;

	public void loadLayout() {
		ui = new UIContainer();

		// LeftPanel
		leftPanel = new LeftPanel();

		// ContentTopPanel
		contentTopPanel = new ContentTopPanel();
		
		// ContentCenterPanel
		bSearchPanel = new BSearchPanel();
		bExportPanel = new BExportPanel();
		
		cCenterPanel = new CCenterPanel();
		cBottomPanel = new CBottomContainerPanel();
		cBottomPanel.loadCSearchPanel(bSearchPanel);
		cBottomPanel.loadCExportPanel(bExportPanel);
		
		contentCenterPanel = new ContentCenterPanel();
		contentCenterPanel.loadCCenterPanel(cCenterPanel);
		contentCenterPanel.loadCBottomPanel(cBottomPanel);
		
		// ContentBottomPanel
		contentBottomPanel = new ContentBottomPanel();

		contentPanel = new ContentContainerPanel();
		contentPanel.loadContentTopPanel(contentTopPanel);
		contentPanel.loadContentCenterPanel(contentCenterPanel);
		contentPanel.loadContentBottomPanel(contentBottomPanel);
		
		// load left panel
		ui.loadLeftPanel(leftPanel);

		// load content panel
		ui.loadContentPanel(contentPanel);

	}

}
