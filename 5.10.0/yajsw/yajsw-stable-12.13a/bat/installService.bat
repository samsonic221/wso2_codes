pushd %~dp0
call setenv.bat %1
%wrapper_bat% -i %conf_file%
popd



