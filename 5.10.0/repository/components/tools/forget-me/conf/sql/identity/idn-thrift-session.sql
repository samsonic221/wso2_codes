UPDATE IDN_THRIFT_SESSION
SET USER_NAME = `pseudonym`
WHERE USER_NAME = `username`
      AND TENANT_ID = `tenant_id`