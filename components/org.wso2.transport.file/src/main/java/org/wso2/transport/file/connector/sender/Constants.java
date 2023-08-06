/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.transport.file.connector.sender;

/**
 * This class contains the constants related to File transport.
 */
public final class Constants {

    public static final String PROTOCOL_FILE = "file";
    public static final String PROTOCOL_FTP = "ftp";
    public static final String PROTOCOL_SFTP = "sftp";
    public static final String BINARY_FILE_EXTENSION = "bin";
    public static final String PROTOCOL = "PROTOCOL";

    public static final String APPEND = "append";
    public static final String FILE_URI = "uri";
    public static final String ACTION = "action";
    public static final String CREATE = "create";
    public static final String WRITE = "write";
    public static final String DELETE = "delete";
    public static final String COPY = "copy";
    public static final String MOVE = "move";
    public static final String MOVE_IF_EXIST_KEEP = "keep";
    public static final String MOVE_IF_EXIST_OVERWRITE = "overwrite";
    public static final String MOVE_IF_EXIST_MODE = "move.if.exist.mode";
    public static final String READ = "read";
    public static final String EXISTS = "exists";
    public static final String FILE_READ_WAIT_TIMEOUT = "fileReadWaitTimeout";
    public static final String MODE = "mode";
    public static final String MODE_TYPE_LINE = "line";
    public static final String MODE_TYPE_BINARY_CHUNKED = "binary.chunked";
    public static final String HEADER_PRESENT = "header.present";
    public static final String READ_ONLY_HEADER = "read.only.header";
    public static final String READ_ONLY_TRAILER = "read.only.trailer";
    public static final String SKIP_TRAILER = "skip.trailer";
    public static final String BUFFER_SIZE_IN_BINARY_CHUNKED = "buffer.size";

    // Constants for FTP protocol related configurations
    public static final String FTP_PASSIVE_MODE = "FTP_PASSIVE_MODE";
    public static final String USER_DIR_IS_ROOT = "USER_DIR_IS_ROOT";
    public static final String IDENTITY = "IDENTITY";
    public static final String IDENTITY_PASS_PHRASE = "IDENTITY_PASS_PHRASE";
    public static final String AVOID_PERMISSION_CHECK = "AVOID_PERMISSION_CHECK";
    public static final String HEADER_LINE_COUNT = "header.line.count";

    private Constants() {
    }
}
