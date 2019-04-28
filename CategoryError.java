/*****************************************************
 * Copyright (c) 2013, Systemax Inc.
 * All rights reserved.
 *****************************************************/
package com.systemax.web.microservice.category.error;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.systemax.web.microservice.common.type.ServiceError;

/**
 * The Enum categorytype.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CategoryError implements ServiceError {

	/** The InvalidCategoryKey. */
	InvalidCategoryKey {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Category Key is invalid";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid category key in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 8000;
		}
	},

	/**
	 * The CategoryKeyNotFound.
	 */
	CategoryKeyNotFound {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.NOT_FOUND;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Category key doesnot exist";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Category key not found";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80001;
		}
	},
	/** The MissingCategoryKey. */
	MissingCategoryKey {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Category key is a required URL parameter";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid category key in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80002;
		}
	},
	/** The MissingPrimaryKey. */
	MissingPrimaryKey {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Primary Key is a required URL Parameter";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid primary key in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80003;
		}
	},

	/** The InvalidPrimaryKey. */
	InvalidPrimaryKey {

		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Web Primary Key is invalid";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid web primary key in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80004;
		}
	},

	/** The InvalidAccountKey. */
	InvalidAccountKey {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Account Key is invalid";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid account key in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80005;
		}
	},

	/** The Missing present type. */
	MissingPresentType {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Present type is a required parameter";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid 'presentType' in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 10004;
		}
	},

	/**
	 * The InvalidPresentType.
	 */

	InvalidPresentType {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Present type is invalid";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid 'presentType' in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 2104;
		}
	},
	/**
	 * The WebPrimaryCategoryNotFound.
	 */
	WebPrimaryCategoryNotFound {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.NOT_FOUND;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "Web Primary Category doesnot exist";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Web Primary Category is not found";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80006;
		}
	},

	/** The Featured items not found. */
	FeaturedItemsNotFound {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.NOT_FOUND;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "No Featured items retrieved from the cache";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "No featured items found.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80007;
		}
	},
	/** The Missing url . */
	MissingUrlDesc {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "url desc is a required parameter";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid url desc in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80008;
		}
	},
	
	/** The MissingID. */
	MissingID {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "ID is a required URL parameter";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid ID in the request URL.";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80009;
		}
	},
	
	/** The InvalidIdType. */
	InvalidIdType {
		/**
		 * {@inheritDoc}
		 */
		public HttpStatus getStatus() {
			return HttpStatus.BAD_REQUEST;
		}

		/**
		 * {@inheritDoc}
		 */
		public String getDeveloperMessage() {
			return "The value of 'idType' must be categoryKey, categoryURL or categoryId ";
		}

		/**
		 * {@inheritDoc}
		 */
		public String getUserMessage() {
			return "Please include a valid 'idType' in the request query string.  Valid values are key, url, or Id";
		}

		/**
		 * {@inheritDoc}
		 */
		public int getErrorCode() {
			return 80010;
		}
	};
}
