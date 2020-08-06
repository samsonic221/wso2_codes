pushd %~dp0
call setenv.bat %1
%wrapper_bat% -t %conf_file%
popd



