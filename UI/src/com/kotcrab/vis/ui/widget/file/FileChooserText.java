/*
 * Copyright 2014-2015 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.ui.widget.file;

import com.kotcrab.vis.ui.i18n.BundleText;

/**
 * Contains texts for chooser access via I18NBundle
 * @since 0.7.0
 */
public enum FileChooserText implements BundleText {
	// @formatter:off
	TITLE_CHOOSE_FILES						{public String getName () {return "titleChooseFiles";}},
	TITLE_CHOOSE_DIRECTORIES				{public String getName () {return "titleChooseDirectories";}},
	TITLE_CHOOSE_FILES_AND_DIRECTORIES		{public String getName () {return "titleChooseFilesAndDirectories";}},

	CANCEL									{public String getName () {return "cancel";}},
	FILE_NAME								{public String getName () {return "fileName";}},
	DESKTOP									{public String getName () {return "desktop";}},
	COMPUTER								{public String getName () {return "computer";}},

	OPEN									{public String getName () {return "open";}},
	SAVE									{public String getName () {return "save";}},

	BACK									{public String getName () {return "back";}},
	FORWARD									{public String getName () {return "forward";}},
	PARENT_DIRECTORY						{public String getName () {return "parentDirectory";}},
	NEW_DIRECTORY							{public String getName () {return "newDirectory";}},

	DIRECTORY_NO_LONGER_EXISTS				{public String getName () {return "directoryNoLongerExists";}},

	POPUP_TITLE								{public String getName () {return "popupTitle";}},
	POPUP_CHOOSE_FILE						{public String getName () {return "popupChooseFile";}},
	POPUP_SELECTED_FILE_DOES_NOT_EXIST		{public String getName () {return "popupSelectedFileDoesNotExist";}},
	POPUP_DIRECTORY_DOES_NOT_EXIST			{public String getName () {return "popupDirectoryDoesNotExist";}},
	POPUP_ONLY_DIRECTORIES					{public String getName () {return "popupOnlyDirectories";}},
	POPUP_FILENAME_INVALID					{public String getName () {return "popupFilenameInvalid";}},
	POPUP_FILE_EXIST_OVERWRITE				{public String getName () {return "popupFileExistOverwrite";}},
	POPUP_MULTIPLE_FILE_EXIST_OVERWRITE 	{public String getName () {return "popupMultipleFileExistOverwrite";}},
	POPUP_DELETE_FILE_FAILED			 	{public String getName () {return "popupDeleteFileFailed";}},

	CONTEXT_MENU_DELETE						{public String getName () {return "contextMenuDelete";}},
	CONTEXT_MENU_MOVE_TO_TRASH				{public String getName () {return "contextMenuMoveToTrash";}},
	CONTEXT_MENU_SHOW_IN_EXPLORER			{public String getName () {return "contextMenuShowInExplorer";}},
	CONTEXT_MENU_ADD_TO_FAVORITES			{public String getName () {return "contextMenuAddToFavorites";}},
	CONTEXT_MENU_REMOVE_FROM_FAVORITES		{public String getName () {return "contextMenuRemoveFromFavorites";}},
	CONTEXT_MENU_DELETE_WARNING				{public String getName () {return "contextMenuDeleteWarning";}},
	CONTEXT_MENU_MOVE_TO_TRASH_WARNING		{public String getName () {return "contextMenuMoveToTrashWarning";}},
	CONTEXT_MENU_NEW_DIRECTORY 				{public String getName () {return "contextMenuNewDirectory";}},

	NEW_DIRECTORY_DIALOG_TITLE 				{public String getName () {return "newDirectoryDialogTitle";}},
	NEW_DIRECTORY_DIALOG_TEXT 				{public String getName () {return "newDirectoryDialogText";}},
	NEW_DIRECTORY_DIALOG_ILLEGAL_CHARACTERS {public String getName () {return "newDirectoryDialogIllegalCharacters";}},
	NEW_DIRECTORY_DIALOG_ALREADY_EXISTS 	{public String getName () {return "newDirectoryDialogAlreadyExists";}};
	// @formatter:on

	@Override
	public String get () {
		throw new UnsupportedOperationException();
	}

	@Override
	public String format () {
		throw new UnsupportedOperationException();
	}

	@Override
	public String format (Object... arguments) {
		throw new UnsupportedOperationException();
	}
}
