/* generated by template _lsp.WorkspaceService*/

package de.monticore.lang.sdbasis._lsp;

import de.mclsg.lsp.*;
import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.WorkspaceService;
import java.util.Arrays;

public class SDBasisWorkspaceService extends CommonWorkspaceService implements WorkspaceService, WorkspaceServiceWithCapabilities {
    protected WorkspaceServerCapabilities capabilities = new WorkspaceServerCapabilities();

    public SDBasisWorkspaceService(CommonLanguageServer languageServer, IIndexingManager indexingManager){
        super(languageServer, indexingManager);
        registerFileOperationsServerCapabilities();
    }

    protected void registerFileOperationsServerCapabilities(){
        FileOperationsServerCapabilities fileCapabilities = new FileOperationsServerCapabilities();
        fileCapabilities.setDidRename(new FileOperationOptions(Arrays.asList(new FileOperationFilter(new FileOperationPattern("**/*.sd")))));
        fileCapabilities.setDidCreate(new FileOperationOptions(Arrays.asList(new FileOperationFilter(new FileOperationPattern("**/*.sd")))));
        fileCapabilities.setDidDelete(new FileOperationOptions(Arrays.asList(new FileOperationFilter(new FileOperationPattern("**/*.sd")))));
        capabilities.setFileOperations(fileCapabilities);
    }

    public WorkspaceServerCapabilities getCapabilities(){
        return capabilities;
    }

    @Override
    public void didChangeWatchedFiles(DidChangeWatchedFilesParams params) {

    }
}
