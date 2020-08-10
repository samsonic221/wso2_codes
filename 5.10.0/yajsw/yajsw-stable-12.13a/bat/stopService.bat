pushd %~dp0
call setenv.bat %1
%wrapper_bat% -p %conf_file%
popd



