/*
 *    Copyright 2019 OICR
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package io.dockstore.webservice.languages;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import io.dockstore.common.VersionTypeValidation;
import io.dockstore.language.RecommendedLanguageInterface;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class ServicePrototypePlugin implements RecommendedLanguageInterface {

    @Override
    public boolean isService() {
        return true;
    }

    @Override
    public String launchInstructions(String trsID) {
        return null;
    }

    @Override
    public VersionTypeValidation validateWorkflowSet(String initialPath, String contents,
        Map<String, Pair<String, GenericFileType>> indexedFiles) {
        VersionTypeValidation validation = new VersionTypeValidation(true, new HashMap<>());
        //        for(String line : contents.split("\\r?\\n")) {
        //            if (!line.startsWith("import") && !line.startsWith("author") && !line.startsWith("description")) {
        //                validation.setValid(false);
        //                validation.getMessage().put(initialPath, "unknown keyword");
        //            }
        //        }
        return validation;
    }

    @Override
    public VersionTypeValidation validateTestParameterSet(Map<String, Pair<String, GenericFileType>> indexedFiles) {
        return new VersionTypeValidation(true, new HashMap<>());
    }

    @Override
    public Pattern initialPathPattern() {
        return Pattern.compile("/.dockstore/.yml");
    }

    @Override
    public Map<String, Pair<String, GenericFileType>> indexWorkflowFiles(String initialPath, String contents, FileReader reader) {
        Map<String, Pair<String, GenericFileType>> results = new HashMap<>();
        for (String line : contents.split("\\r?\\n")) {
            if (line.startsWith("testFilePath")) {
                final String[] s = line.split(":");
                final String importedFile = reader.readFile(s[1].trim());
                results.put(s[1].trim(), new ImmutablePair<>(importedFile, GenericFileType.TEST_PARAMETER_FILE));
            }
        }
        return results;
    }

    @Override
    public WorkflowMetadata parseWorkflowForMetadata(String initialPath, String contents,
        Map<String, Pair<String, GenericFileType>> indexedFiles) {
        WorkflowMetadata metadata = new WorkflowMetadata();
        for (String line : contents.split("\\r?\\n")) {
            //            if (line.startsWith("author")) {
            //                final String[] s = line.split(":");
            //                metadata.setAuthor(s[1].trim());
            //            }
            if (line.startsWith("description")) {
                final String[] s = line.split(":");
                metadata.setDescription(s[1].trim());
            }
        }
        return metadata;
    }
}