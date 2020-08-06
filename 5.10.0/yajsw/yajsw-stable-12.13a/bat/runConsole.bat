pushd %~dp0
call setenv.bat %1
%wrapper_bat% -c %conf_file%
popd

